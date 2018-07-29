package com.baizhi.conf;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by Administrator on 2018/7/16.
 */
public class MyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
       /*授权*/
        System.out.println("========================");
        SimpleAuthorizationInfo authorizationInfo = null;
        String primaryPrincipal = (String) principals.getPrimaryPrincipal();
        if (primaryPrincipal.equals("zhangsan")) {
            authorizationInfo = new SimpleAuthorizationInfo();
            authorizationInfo.addRole("normal");
            authorizationInfo.addStringPermission("banner:add");
            authorizationInfo.addStringPermission("banner:update");
        }

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String principal = (String) token.getPrincipal();
        if (principal.equals("zhangsan")) {
            return new SimpleAuthenticationInfo("zhangsan", "123456", this.getName());
        }


        return null;
    }
}
