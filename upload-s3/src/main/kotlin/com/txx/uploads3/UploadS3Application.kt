package com.txx.uploads3

import com.amazonaws.HttpMethod
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
@RestController
class UploadS3Application {

    @Autowired
    lateinit var s3Client: AmazonS3


    @GetMapping("/s3/url/{filename}")
    fun getPreUrl(@PathVariable filename: String): String {
        val expireTime = 30L;
        val expireEndTime = System.currentTimeMillis() + expireTime * 1000
        val expiration = Date(expireEndTime)
        val url = s3Client.generatePresignedUrl("test", "2020/08/" + filename, expiration, HttpMethod.PUT)
        return url.toString()
    }


    @Bean
    fun s3Client(): AmazonS3 {
        val credentials = BasicAWSCredentials("AKIAIOSFODNN7EXAMPLE", "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
        val endPointConfig = AwsClientBuilder.EndpointConfiguration("http://192.168.100.178:9000", "")
        val credentialsProvider = AWSStaticCredentialsProvider(credentials)
        return AmazonS3Client.builder()
                .withEndpointConfiguration(endPointConfig)
                .withCredentials(credentialsProvider)
                .build()
    }
}

fun main(args: Array<String>) {
    runApplication<UploadS3Application>(*args)
}
