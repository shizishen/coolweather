package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        /*
        1. `sendOkHttpRequest` 方法：该方法接受两个参数，一个是请求地址 `address`，另一个是 OkHttp 的回调接口 `callback`。在方法内部，它创建了一个 OkHttpClient 实例，构建了一个请求对象，并使用异步方式发送请求，最后将回调接口传递给请求的 `enqueue` 方法。

        2. `OkHttpClient` 实例：使用 OkHttp 库创建一个 OkHttpClient 实例，用于发送 HTTP 请求。

        3. `Request` 对象：使用 `Request.Builder` 创建一个请求对象，设置请求的 URL 为 `address` 参数。

        4. `client.newCall(request).enqueue(callback)`：通过 `client` 的 `newCall` 方法创建一个 Call 对象，并调用 `enqueue` 方法来发送异步请求。回调接口 `callback` 将在请求完成后被调用。

        这个工具类可以方便地发送网络请求并处理响应。你可以在其他地方调用 `HttpUtil.sendOkHttpRequest` 方法，并传递相应的地址和回调接口来完成网络请求的发送和处理。
         */
    }

}
