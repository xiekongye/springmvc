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
});