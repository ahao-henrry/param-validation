package com.ahao.paramvalidation.vo;

import javax.validation.constraints.NotEmpty;

/**
 * @author ahao
 * @since 2019/6/12 20:14
 **/
public class CarVO {
    @NotEmpty(message = "你的车什么颜色啊")
    private String carColor;

    private String carWeight;

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(String carWeight) {
        this.carWeight = carWeight;
    }
}
