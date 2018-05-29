package com.coco.runtime;

import com.coco.annotation.StatisticsAnnotation;
import com.coco.statistics.UmengStatistics;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wind on 2018/5/26.
 */
@Aspect
public class CocoRuntime {
    @Before("execution(@com.coco.annotation.StatisticsAnnotation * *(..)) && @annotation(ann)")
    public void statisticsClick(JoinPoint joinPoint,StatisticsAnnotation ann){
        UmengStatistics.onEvent(ann.value());
        return;
    }
}
