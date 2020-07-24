package com.yinuo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceLogAspect {

    public static final Logger log =
            LoggerFactory.getLogger(ServiceLogAspect.class);

    @Around("execution(* com.yinuo.service.impl..*.*(..))")
    public Object recordTimeLog(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("====== start {}.{} ======",
                joinPoint.getTarget().getClass(),
                joinPoint.getSignature().getName());

        long begin = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        long takeTime = end - begin;

        if (takeTime > 3000) {
            log.error("====== finish，run time：{} millis sec ======", takeTime);
        } else if (takeTime > 2000) {
            log.warn("====== finish，run time：{} millis sec  ======", takeTime);
        } else {
            log.info("====== finish，run time：{} millis sec  ======", takeTime);
        }

        return result;
    }

}
