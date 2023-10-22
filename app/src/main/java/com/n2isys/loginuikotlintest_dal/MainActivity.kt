package com.n2isys.loginuikotlintest_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.n2isys.loginuikotlintest_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewBind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewBind.root)

        viewBind.BtnLogin.setOnClickListener {

            val ls_id = viewBind.TxtId.text
            val ls_pwd = viewBind.TxtPwd.text

            if(ls_id == "admin@test.com" && ls_pwd = "qwer"){
                Toast.makeText("로그인성공", "", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText("로그인실패", "", Toast.LENGTH_SHORT).show()

            }


        }
    }
}