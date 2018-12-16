package exception;

public interface ErrorCode {

    int COMMON_ERROR_CODE_START = 0;

    int PLATFORM_ERROR_CODE_START = COMMON_ERROR_CODE_START + 1000;

    int MARKET_ERROR_CODE_START = COMMON_ERROR_CODE_START + 2000;

    int CONSOLE_ERROR_CODE_START = COMMON_ERROR_CODE_START + 3000;

    int APP_NAME_DUPLICATED = CONSOLE_ERROR_CODE_START + 1;

    int PLUGIN_NAME_DUPLICATED = APP_NAME_DUPLICATED + 1;

    int ADMIN_ERROR_CODE_START = COMMON_ERROR_CODE_START + 4000;

}