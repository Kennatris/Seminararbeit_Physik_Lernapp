package com.tinostrasser.seminararbeit_physik_lernapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import ru.noties.jlatexmath.JLatexMathDrawable
import ru.noties.jlatexmath.JLatexMathView

class MFA_Leicht : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mfa_leicht)

        aufgabe1()
        aufgabe2()
        aufgabe3()
        aufgabe4()
        aufgabe5()
        aufgabe6()
        aufgabe7()
        aufgabe8()

        val MFL_1 = findViewById<JLatexMathView>(R.id.MFL_1)

        var drawable = JLatexMathDrawable.builder("\t{F_{Lorentz} = 8*10^{23} N \\ \\ \\ q = -1,6 * 10^{-19} C \\ \\ \\ B =-10*10^{-5} T}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        MFL_1.setLatexDrawable(drawable)
    }

    private fun changePB(value: Boolean) {
        val pB_d = findViewById<ProgressBar>(R.id.progressbar_done)
        var pB_c = findViewById<ProgressBar>(R.id.progressbar_correct)
        val lPB_d = findViewById<TextView>(R.id.lblProgressbar_done)
        val lPB_c = findViewById<TextView>(R.id.lblProgressbar_correct)
        pB_d.incrementProgressBy(1)
        pB_c.max = pB_d.progress
        if (value) {
            pB_c.incrementProgressBy(1)
            magnetAntworten_Leicht = pB_c.progress
        }
        val correctAnswers = pB_c.progress
        val doneAnswers = pB_d.progress
        val maxAnswers = pB_d.max
        lPB_d.text = "Erledigte Aufgaben $doneAnswers von $maxAnswers"
        lPB_c.text = "Richtig gelöste Aufgaben $correctAnswers von $doneAnswers"
    }
    private fun aufgabe1() {
        var button_1_set = false
        var button_2_set = false

        val a1Button = findViewById<Button>(R.id.btnA1_1)
        val a2Button = findViewById<Button>(R.id.btnA1_2)
        val submitButton = findViewById<Button>(R.id.btnA1_submit)
        val explanation = findViewById<TextView>(R.id.txtA1)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = true
        }

        submitButton.setOnClickListener {
            if (button_2_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            }
            submitButton.isClickable = false
            a1Button.setBackgroundColor(getResources().getColor(R.color.red))
            a1Button.isClickable = false
            a2Button.setBackgroundColor(getResources().getColor(R.color.green))
            a2Button.isClickable = false
            explanation.text = "Erklärung: \nAuch wenn beide spezifische Objekte anziehen, beziehungsweiße abstoßen können, so kennen wir drei wesentliche Unterschiede. (Nachlesen unter: Der Magnet)"
            explanation.height = explanation.lineHeight * explanation.lineCount
            explanation.visibility = View.VISIBLE
        }

    }
    private fun aufgabe2() {
        var button_1_set = false
        var button_2_set = false

        val a1Button = findViewById<Button>(R.id.btnA2_1)
        val a2Button = findViewById<Button>(R.id.btnA2_2)
        val submitButton = findViewById<Button>(R.id.btnA2_submit)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = true
        }

        submitButton.setOnClickListener {
            if (button_2_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            }
            submitButton.isClickable = false
            a1Button.setBackgroundColor(getResources().getColor(R.color.red))
            a1Button.isClickable = false
            a2Button.setBackgroundColor(getResources().getColor(R.color.green))
            a2Button.isClickable = false
        }

    }
    private fun aufgabe3() {
        var button_1_set = false
        var button_2_set = false

        val a1Button = findViewById<Button>(R.id.btnA3_1)
        val a2Button = findViewById<Button>(R.id.btnA3_2)
        val submitButton = findViewById<Button>(R.id.btnA3_submit)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = true
        }

        submitButton.setOnClickListener {
            if (button_2_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            }
            a1Button.setBackgroundColor(getResources().getColor(R.color.green))
            a2Button.setBackgroundColor(getResources().getColor(R.color.red))
            a1Button.isClickable = false
            a2Button.isClickable = false
            submitButton.isClickable = false
        }

    }
    private fun aufgabe4() {
        var button_1_set = false
        var button_2_set = false

        val a1Button = findViewById<Button>(R.id.btnA4_1)
        val a2Button = findViewById<Button>(R.id.btnA4_2)
        val submitButton = findViewById<Button>(R.id.btnA4_submit)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = true
        }

        submitButton.setOnClickListener {
            if (button_2_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            }
            a1Button.setBackgroundColor(getResources().getColor(R.color.green))
            a2Button.setBackgroundColor(getResources().getColor(R.color.red))
            a1Button.isClickable = false
            a2Button.isClickable = false
            submitButton.isClickable = false
        }

    }
    private fun aufgabe5() {
        var button_1_set = false
        var button_2_set = false

        val a1Button = findViewById<Button>(R.id.btnA5_1)
        val a2Button = findViewById<Button>(R.id.btnA5_2)
        val submitButton = findViewById<Button>(R.id.btnA5_submit)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = true
        }

        submitButton.setOnClickListener {
            if (button_2_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            }
            a1Button.setBackgroundColor(getResources().getColor(R.color.green))
            a2Button.setBackgroundColor(getResources().getColor(R.color.red))
            a1Button.isClickable = false
            a2Button.isClickable = false
            submitButton.isClickable = false
        }

    }
    private fun aufgabe6() {
        var button_1_set = false
        var button_2_set = false

        val a1Button = findViewById<Button>(R.id.btnA6_1)
        val a2Button = findViewById<Button>(R.id.btnA6_2)
        val submitButton = findViewById<Button>(R.id.btnA6_submit)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = true
        }

        submitButton.setOnClickListener {
            if (button_2_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            }
            a1Button.setBackgroundColor(getResources().getColor(R.color.red))
            a2Button.setBackgroundColor(getResources().getColor(R.color.green))
            a1Button.isClickable = false
            a2Button.isClickable = false
            submitButton.isClickable = false
        }

    }
    private fun aufgabe7() {
        var button_1_set = false
        var button_2_set = false
        var button_3_set = false

        val a1Button = findViewById<Button>(R.id.btnA7_1)
        val a2Button = findViewById<Button>(R.id.btnA7_2)
        val a3Button = findViewById<Button>(R.id.btnA7_3)
        val submitButton = findViewById<Button>(R.id.btnA7_submit)

        a1Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a3Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = true
            button_2_set = false
            button_3_set = false
        }

        a2Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.beige))
            a3Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            button_1_set = false
            button_2_set = true
            button_3_set = false
        }

        a3Button.setOnClickListener {
            a1Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a2Button.setBackgroundColor(getResources().getColor(R.color.Türkis))
            a3Button.setBackgroundColor(getResources().getColor(R.color.beige))
            button_1_set = false
            button_2_set = false
            button_3_set = true
        }

        submitButton.setOnClickListener {
            if (button_1_set) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
            }
            a1Button.setBackgroundColor(getResources().getColor(R.color.green))
            a2Button.setBackgroundColor(getResources().getColor(R.color.red))
            a3Button.setBackgroundColor(getResources().getColor(R.color.red))
            a1Button.isClickable = false
            a2Button.isClickable = false
            a3Button.isClickable = false
            submitButton.isClickable = false
        }

    }
    private fun aufgabe8() {

        val numberPicker_1 = findViewById<NumberPicker>(R.id.nPA8_1)
        val numberPicker_2 = findViewById<NumberPicker>(R.id.nPA8_2)
        val numberPicker_3 = findViewById<NumberPicker>(R.id.nPA8_3)
        val submitButton = findViewById<Button>(R.id.btnA8_submit)

        numberPicker_1.maxValue = 100
        numberPicker_2.maxValue = 9
        numberPicker_3.maxValue = 9

        submitButton.setOnClickListener {

            if (numberPicker_1.value == 5 && numberPicker_2.value == 0 && numberPicker_3.value == 0) {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_green))
                submitButton.text = "Richtig"
                changePB(true)
            } else {
                submitButton.setBackgroundColor(getResources().getColor(R.color.dark_red))
                submitButton.text = "Falsch"
                changePB(false)
                numberPicker_1.value = 5
                numberPicker_2.value = 0
                numberPicker_3.value = 0
            }
            numberPicker_1.maxValue = 5
            numberPicker_1.minValue = 5
            numberPicker_2.maxValue = 0
            numberPicker_2.minValue = 0
            numberPicker_3.maxValue = 0
            numberPicker_3.minValue = 0
            submitButton.isClickable = false
        }

    }
}