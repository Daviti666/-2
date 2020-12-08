package com.example.krestikiandnolikiiiiiiiiiiiiiiiiii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var firstPlayer:Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        button00.setOnClickListener {
            WinnerChecker(button00)
        }
        button01.setOnClickListener {
            WinnerChecker(button01)
        }
        button02.setOnClickListener {
            WinnerChecker(button02)
        }
        button10.setOnClickListener {
            WinnerChecker(button10)
        }
        button11.setOnClickListener {
            WinnerChecker(button11)
        }
        button12.setOnClickListener {
            WinnerChecker(button12)
        }
        button20.setOnClickListener {
            WinnerChecker(button20)
        }
        button21.setOnClickListener {
            WinnerChecker(button21)
        }
        button22.setOnClickListener {
            WinnerChecker(button22)
        }
        restart.setOnClickListener {
            button00.text = ""
            button00.isClickable = true

            button01.text = ""
            button01.isClickable = true

            button02.text = ""
            button02.isClickable = true

            button10.text = ""
            button10.isClickable = true

            button11.text = ""
            button11.isClickable = true

            button12.text = ""
            button12.isClickable = true

            button20.text = ""
            button20.isClickable = true

            button21.text = ""
            button21.isClickable = true

            button22.text = ""
            button22.isClickable = true

        }


    }
    private fun WinnerChecker(button: Button){
        d("OnClick","button00")
        if (firstPlayer) {
            button.text = "x"
        }
        else {button.text = "o"
        }
        firstPlayer = !firstPlayer
        button.isClickable = false
        WinnerChecker()
    }
    private fun WinnerChecker(){
        if        (button00.text.toString().isNotEmpty() && button00.text.toString() == button01.text.toString() && button01.text.toString() == button02.text.toString()) {
            showToast(button00.text.toString())
        } else if (button10.text.toString().isNotEmpty() && button10.text.toString() == button11.text.toString() && button10.text.toString() == button12.text.toString()) {
            showToast(button10.text.toString())
        } else if (button20.text.toString().isNotEmpty() && button20.text.toString() == button21.text.toString() && button20.text.toString() == button22.text.toString()) {
            showToast(button20.text.toString())
        } else if (button00.text.toString().isNotEmpty() && button00.text.toString() == button10.text.toString() && button00.text.toString() == button20.text.toString()) {
            showToast(button00.text.toString())
        } else if (button01.text.toString().isNotEmpty() && button01.text.toString() == button11.text.toString() && button01.text.toString() == button21.text.toString()) {
            showToast(button01.text.toString())
        } else if (button02.text.toString().isNotEmpty() && button02.text.toString() == button12.text.toString() && button12.text.toString() == button22.text.toString()) {
            showToast(button02.text.toString())
        } else if (button00.text.toString().isNotEmpty() && button00.text.toString() == button11.text.toString() && button11.text.toString() == button22.text.toString()) {
            showToast(button00.text.toString())
        } else if (button02.text.toString().isNotEmpty() && button02.text.toString() == button11.text.toString() && button11.text.toString() == button20.text.toString()) {
            showToast(button02.text.toString())
        } else if (button00.text.toString().isNotEmpty() && button01.text.toString().isNotEmpty() && button02.text.toString().isNotEmpty() && button10.text.toString().isNotEmpty()
                && button11.text.toString().isNotEmpty() && button12.text.toString().isNotEmpty() && button20.text.toString().isNotEmpty() && button21.text.toString().isNotEmpty()
                && button22.text.toString().isNotEmpty()) {
            Toast.makeText(this,"Game is draw",Toast.LENGTH_SHORT).show()
        }
    }
    private fun showToast(winnerSymbol:String){
        Toast.makeText(this,"Winner is $winnerSymbol",Toast.LENGTH_SHORT).show()
        button00.isClickable = false

        button01.isClickable = false

        button02.isClickable = false

        button10.isClickable = false

        button11.isClickable = false

        button12.isClickable = false

        button20.isClickable = false

        button21.isClickable = false

        button22.isClickable = false

    }

}