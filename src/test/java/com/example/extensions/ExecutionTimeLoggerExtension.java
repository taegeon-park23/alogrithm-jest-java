package com.example.extensions;

import java.util.logging.Logger;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * ExcutionTimeLoggerExtension
 * 테스트 실행시간 로깅
 * 
 * @author taegeon-park23
 */
public class ExecutionTimeLoggerExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    static final Logger logger = Logger.getLogger(ExecutionTimeLoggerExtension.class.getName());

    public static enum TimeType {
        START_TIME, END_TIME
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        String testClassName = context.getRequiredTestClass().getName();
        String testMethodName = context.getRequiredTestMethod().getName();
        return context.getStore(ExtensionContext.Namespace.create(testClassName, testMethodName));
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        getStore(context).put(TimeType.START_TIME, System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        long startTime = getStore(context).remove(TimeType.START_TIME, long.class);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        String testClassName = context.getRequiredTestClass().getName();
        String testName = context.getDisplayName();

        logger.info(() -> String.format("Excuted {%s} [%d]ms", testClassName + "=:" + testName, duration));
    }

}