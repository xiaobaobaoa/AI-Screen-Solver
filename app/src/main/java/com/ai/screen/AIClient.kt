package com.ai.screen

object AIClient {
    fun solve(text: String, callback: (String) -> Unit) {
        callback("答案：x = 2\n步骤：移项求解\n知识点：一元一次方程")
    }
}
