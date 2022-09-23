package com.example.scientific

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    lateinit var primaryTv : TextView
    lateinit var secondaryTv : TextView
    lateinit var acBtn : Button
    lateinit var cBtn : Button
    lateinit var brace1Btn : Button
    lateinit var brace2Btn : Button
    lateinit var sinBtn : Button
    lateinit var cosBtn : Button
    lateinit var tanBtn : Button
    lateinit var lnBtn : Button
    lateinit var logBtn : Button
    lateinit var factBtn : Button
    lateinit var squareBtn : Button
    lateinit var sqRootBtn : Button
    lateinit var invBtn : Button
    lateinit var btn0 : Button
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btnpie : Button
    lateinit var btnPoint : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var btnSub : Button
    lateinit var btnAdd : Button
    lateinit var btnEql : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primaryTv = findViewById(R.id.idTVPrimary)
        secondaryTv = findViewById(R.id.idTVSecondary)
        acBtn = findViewById(R.id.idBtnAc)
        cBtn = findViewById(R.id.idBtnC)
        brace1Btn = findViewById(R.id.idBtnBrac1)
        brace2Btn = findViewById(R.id.idBtnBrac2)
        sinBtn = findViewById(R.id.idBtnSin)
        cosBtn = findViewById(R.id.idBtnCos)
        tanBtn = findViewById(R.id.idBtntan)
        lnBtn = findViewById(R.id.idBtnln)
        logBtn = findViewById(R.id.idBtnlog)
        factBtn = findViewById(R.id.idBtnfact)
        squareBtn = findViewById(R.id.idBtnSquare)
        sqRootBtn = findViewById(R.id.idBtnSqRoot)
        invBtn = findViewById(R.id.idBtnInv)
        btnDiv = findViewById(R.id.idBtnDiv)
        btnMul = findViewById(R.id.idBtnMul)
        btnSub = findViewById(R.id.idBtnSub)
        btnAdd = findViewById(R.id.idBtnAdd)
        btnEql = findViewById(R.id.idBtnEql)
        btn0 = findViewById(R.id.idBtn0)
        btn1 = findViewById(R.id.idBtn1)
        btn2 = findViewById(R.id.idBtn2)
        btn3 = findViewById(R.id.idBtn3)
        btn4 = findViewById(R.id.idBtn4)
        btn5 = findViewById(R.id.idBtn5)
        btn6 = findViewById(R.id.idBtn6)
        btn7 = findViewById(R.id.idBtn7)
        btn8 = findViewById(R.id.idBtn8)
        btn9 = findViewById(R.id.idBtn9)
        btnPoint = findViewById(R.id.idBtnDot)
        btnpie = findViewById(R.id.idBtnPie)


        btn0.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "0")
        }
        btn1.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "1")
        }
        btn2.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "2")
        }
        btn3.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "3")
        }
        btn4.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "4")
        }
        btn5.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "5")
        }
        btn6.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "6")
        }
        btn7.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "7")
        }
        btn8.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "8")
        }
        btn9.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "9")
        }
        btnAdd.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "+")
        }
        btnSub.setOnClickListener {
            val str: String = primaryTv.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                primaryTv.text = (primaryTv.text.toString() + "-")
            }
        }
        btnMul.setOnClickListener {
            val str: String = primaryTv.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                primaryTv.text = (primaryTv.text.toString() + "x")
            }
        }
        btnDiv.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "÷")
        }
        brace1Btn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "(")
        }
        brace2Btn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + ")")
        }
        btnPoint.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + ".")
        }
        btnpie.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "3.142")
            secondaryTv.text = (btnpie.text.toString())
        }
        sinBtn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "sin")
        }
        cosBtn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "cos")
        }
        tanBtn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "tan")
        }
        invBtn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "^" + "(-1)")
        }
        lnBtn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "ln")
        }
        logBtn.setOnClickListener {
            primaryTv.text = (primaryTv.text.toString() + "log")
        }
        sqRootBtn.setOnClickListener {
            if (primaryTv.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number...", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = primaryTv.text.toString()
                val r = Math.sqrt(str.toDouble())
                val result = r.toString()
                primaryTv.setText(result)
            }
        }
        btnEql.setOnClickListener {
            val str: String = primaryTv.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            primaryTv.setText(r)
            secondaryTv.text = str
        }
        acBtn.setOnClickListener {
            primaryTv.setText("")
            secondaryTv.setText("")
        }
        cBtn.setOnClickListener {
            var str: String = primaryTv.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                primaryTv.text = str
            }
        }
        squareBtn.setOnClickListener {
            if (primaryTv.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number...", Toast.LENGTH_SHORT).show()
            } else {
                val d: Double = primaryTv.getText().toString().toDouble()
                val square = d * d
                primaryTv.setText(square.toString())
                secondaryTv.text = "$d"
            }
        }
        factBtn.setOnClickListener {
            if (primaryTv.text.toString().isEmpty()) {
                Toast.makeText(this, "Please a valid number...", Toast.LENGTH_SHORT).show()
            } else {
                val value: Int = primaryTv.text.toString().toInt()
                val fact: Int = factorial(value)
                primaryTv.setText(fact.toString())
                secondaryTv.text = "$value'!"
            }
        }
    }
            fun factorial(n: Int): Int{
                return if(n==1||n==0) 1 else n * factorial(n-1)
                }
            fun evaluate(str: String): Double{
                return object : Any() {
                    var pos = -1
                    var ch = 0
                    fun nextChar(){
                        ch = if (++pos < str.length) str[pos].toInt() else -1
                    }
                    fun  eat(charToEat: Int): Boolean{
                        while (ch == charToEat){
                            nextChar()
                            return true
                        }
                        return false
                    }
                    fun parse(): Double{
                        nextChar()
                        val x = parseExpression()
                        if (pos < str.length) throw RuntimeException("Unexpected" +ch.toChar())
                        return x
                    }
                    fun parseExpression(): Double{
                        var x = parseTerm()
                        while(true){
                            if (eat('+'.toInt())) x += parseTerm()
                            else if (eat('-'.toInt())) x -= parseTerm()
                            else return x
                        }
                    }
                    fun parseTerm(): Double{
                        var x = parseTerm()
                        while (true){
                            if (eat('*'.toInt())) x *= parseFactor()
                            else if (eat('/'.toInt())) x /= parseFactor()
                            else return x
                        }
                    }
                    fun parseFactor(): Double{
                        if (eat('+'.toInt())) return parseFactor()
                        if(eat('-'.toInt())) return parseFactor()
                        var x: Double
                        val startPos = pos
                        if (eat('('.toInt())){
                            x = parseExpression()
                            eat(')'.toInt())
                        }else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()){
                            while (ch >= '0'.toInt() && ch<= '9'.toInt() || ch == '.'.toInt())nextChar()
                            x = str.substring(startPos, pos).toDouble()
                        }
                        else if (ch >='a'.toInt() && ch <= 'z'.toInt()){
                            while (ch >= 'a'.toInt() && ch <= 'z'.toInt())nextChar()
                            val func = str.substring(startPos, pos)
                            x = parseFactor()
                            x =
                                if (func =="sqrt") Math.sqrt(x)
                            else if (func == "Sin") Math.sin(Math.toRadians(x))
                            else if (func == "cos") Math.cos(Math.toRadians(x))
                            else if (func == "tan") Math.tan(Math.toRadians(x))
                            else if (func == "log") Math.log10(x)
                            else if (func == "ln") Math.log(x)
                            else throw RuntimeException("Unknown function: $func")
                        }
                        else
                        {
                            throw RuntimeException("Unexpected: " +ch.toChar())
                        }
                        if (eat('^'.toInt())) x = Math.pow(x, parseFactor())
                        return x
                    }

                }.parse()
            }
}
