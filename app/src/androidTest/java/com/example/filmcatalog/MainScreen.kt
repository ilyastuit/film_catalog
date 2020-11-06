package com.example.filmcatalog

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton

class MainScreen : Screen<MainScreen>() {
    val loginButton = KButton { withId(R.id.main_login_button) }
    val loginText = KEditText { withId(R.id.main_login_text)   }
    val passwordText = KEditText { withId(R.id.main_password_text) }
}