/**
 * Created by You on 2017/5/26.
 */
require.config({
    //这里每次都要加上应用名，看看怎么去掉
    baseUrl:'/springmvc/js/',
    paths:{
        jquery:'lib/jquery-3.2.1'
    }
});

require(['jquery'],function ($) {
    console.log('RequireJS Jquery load success');

    //注册事件
    $('#register').on('click',function () {
       console.log('注册事件');
    });

    //登陆事件
    $('#submit').on('click',function () {
        console.log('登陆事件');
        var userName = $('#userName').val();
        var password = $('#password').val();
        if (!userName || !password){
            alert("用户名密码不能为空！");
            return;
        }
        processLogin(userName,password);
    });

    function processLogin(userName,password) {
        $.ajax("/springmvc/login",{
            type:'POST',
            async:true,
            data:{
                userName:userName,
                password:password
            },
            dataType:'json',
            success:function (data) {
                console.log('login success!');
            },
            error:function (xhr,textStatus) {
                console.log('login error!');
            }
        });
    }
});