package com.n2isys.loginuikotlintest_dal

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.n2isys.loginuikotlintest_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewBind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewBind.root)

        viewBind.BtnLogin.setOnClickListener {

            val ls_id = viewBind.TxtId.text.toString()
            val ls_password = viewBind.TxtPwd.text.toString()
            val ls_name = "달정".toString()

            if(ls_id == "admin@test.com" && ls_password == "qwer"){
                Toast.makeText(this, "${ls_name} 관리자입니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인실패입니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}