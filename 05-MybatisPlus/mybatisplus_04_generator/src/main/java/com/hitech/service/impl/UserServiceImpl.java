package com.hitech.service.impl;

import com.hitech.domain.User;
import com.hitech.dao.UserDao;
import com.hitech.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黑马程序员
 * @since 2023-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
