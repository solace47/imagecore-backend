package com.tech.imagecorebackendmodel.picture.valueobject;

import lombok.Getter;

/**
 * lua 脚本执行结果类型
 *
 * @author pine
 */
@Getter
public enum LuaStatusEnum {
    // 成功
    SUCCESS(1L),
    // 失败
    FAIL(-1L),
    ;

    private final long value;

    LuaStatusEnum(long value) {
        this.value = value;
    }

}
