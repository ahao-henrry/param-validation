package com.ahao.paramvalidation.vo;

import javax.validation.constraints.NotEmpty;

/**
 * @author ahao
 * @since 2019/6/12 20:15
 **/
public class DogVO {
    @NotEmpty(message = "你的狗叫什么名字啊")
    private String dogName;

    private String dogColor;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }
}
