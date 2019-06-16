package com.ahao.paramvalidation.vo;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author ahao
 * @since 2019/6/12 20:12
 **/
public class UserVO {
    private String name;

    @NotNull(message = "你多少岁啦")
    private Integer age;

    @Valid
    @NotEmpty(message = "你至少得要有一辆车啊")
    @Size(min = 1, message = "你至少得要有一辆车啊")
    private List<CarVO> cars;

    @Valid
    @NotNull(message = "你得要有只狗啊")
    private DogVO dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<CarVO> getCars() {
        return cars;
    }

    public void setCars(List<CarVO> cars) {
        this.cars = cars;
    }

    public DogVO getDog() {
        return dog;
    }

    public void setDog(DogVO dog) {
        this.dog = dog;
    }
}
