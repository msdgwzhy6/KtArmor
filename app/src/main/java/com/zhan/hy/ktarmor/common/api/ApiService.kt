package com.zhan.hy.ktarmor.common.api

import com.zhan.mvp.data.BaseResponse
import com.zhan.hy.ktarmor.account.model.response.LoginRsp
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

/**
 *  @author: hyzhan
 *  @date:   2019/5/21
 *  @desc:   TODO
 */
interface ApiService {

    @POST(API.LOGIN)
    fun login(@Query("username") username: String,
              @Query("password") password: String): Observable<BaseResponse<LoginRsp>>
}