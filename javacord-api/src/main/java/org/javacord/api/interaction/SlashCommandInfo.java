package org.javacord.api.interaction;

import org.javacord.api.entity.permission.PermissionType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SlashCommandInfo {
    String name();
    String description() default "·";
    boolean nsfw() default false;
    boolean requiresAdmin() default false;
    boolean enableInDms() default true;
    long restrictToServer() default -1L;
    PermissionType[] requiresPermissions() default {};
}