package com.txx.rabbit.mapper;

import com.txx.rabbit.bean.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
public interface UserMapper {

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @Insert("insert into `user`(mobile,password) values(#{mobile},#{password})")
    int saveUser(User user);
}
