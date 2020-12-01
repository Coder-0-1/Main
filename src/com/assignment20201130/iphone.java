package com.assignment20201130;

public class iphone extends telephone implements phone{

    @Override
    public void photo() {
        System.out.println("是否支持拍照：支持");
    }

    @Override
    public void video() {
        System.out.println("是否支持播放视频：支持");
    }

    @Override
    public void waterProof() {
        System.out.println("是否支持防水：支持");
    }

    @Override
    public void music() {
        System.out.println("是否支持播放音乐：支持");
    }

    public static void main(String[] args) {
        iphone ip = new iphone();
        ip.Call();
        ip.sendMess();
        ip.photo();
        ip.video();
        ip.waterProof();
        ip.music();
    }
}
interface phone {
    void photo();

    void video();

    void waterProof();

    void music();
}
class telephone{
    public void Call() {
        System.out.println("打电话");
    }

    public void sendMess() {
        System.out.println("发短信");
    }
}
