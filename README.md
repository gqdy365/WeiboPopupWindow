# WeiboPopupWindow
模仿新浪微博菜单弹出界面；<br /> 

gif效果图
![github](https://github.com/gqdy365/WeiboPopupWindow/blob/master/jdfw.gif "gif效果图") <br /> 

#说一下实现思路： <br /> 
1、截取当前窗口，对图片做高斯模糊处理，将处理后的图片做popupwindow的背景图片； <br /> 
2、创建popupwindow，完成布局，这儿要注意：View的移动范围是由parent的大小决定的，就是只能在parent的范围内移动； <br /> 
3、给买个View添加进入动画，每个比前一个延期50ms播放动画，关闭窗口时相反； <br /> 
4、为View的动画添加回弹插值器； <br /> 

关于截屏并高斯模糊参考：http://gqdy365.iteye.com/blog/2193913<br /> 
关于动画说明参考：http://gqdy365.iteye.com/blog/2194297 <br /> 

[apk下载地址](https://github.com/gqdy365/WeiboPopupWindow/blob/master/bin/WeiboPopupWindow.apk)<br /> 

