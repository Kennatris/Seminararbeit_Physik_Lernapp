package com.tinostrasser.seminararbeit_physik_lernapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView
import ru.noties.jlatexmath.JLatexMathDrawable
import ru.noties.jlatexmath.JLatexMathView

class MagnetischeFeld : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mangetische_feld)

        val scrollView = findViewById<ScrollView>(R.id.svMagnet)

        // Der Magnet
        val magnetButton = findViewById<Button>(R.id.btnMagnet)
        magnetButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.txtDerMagnet)
            scrollView.smoothScrollTo(0, textView.top)
        }

        // Das magnetische Feld

        val magnetFeldButton = findViewById<Button>(R.id.btnMagnetischesFeld)
        magnetFeldButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.txtDasmagnetischeFeld)
            scrollView.smoothScrollTo(0, textView.top)
        }

        // Magnetfelder ohne Magnete

        val magnetfelderOhneMagneteButton = findViewById<Button>(R.id.btnMagnetfelderOhneMagnete)
        magnetfelderOhneMagneteButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.txtMagnetfelderohneMagnete)
            scrollView.smoothScrollTo(0, textView.top)
        }

        // Lorentzkraft

        val lorentzkraftButton = findViewById<Button>(R.id.btnLorentzkraft)
        lorentzkraftButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.txtLorentzkraft)
            scrollView.smoothScrollTo(0, textView.top)
        }

        // Elementarteilchen im Magnetfeld

        val elementarteilchenimMagnetfeldButton = findViewById<Button>(R.id.btnElementarteilchenImMagnetfeld)
        elementarteilchenimMagnetfeldButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.txtElementarteilchenimMagnetfeld)
            scrollView.smoothScrollTo(0, textView.top)
        }

        // Formeln

        val formelButton = findViewById<Button>(R.id.btnFormeln)
        formelButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.txtFormeln)
            scrollView.smoothScrollTo(0, textView.top)
        }

        val aufgabenButton_1 = findViewById<Button>(R.id.btnAufgaben_1)
        aufgabenButton_1.setOnClickListener {
            val Intent = Intent(this, MagnetischeFeldAufgaben::class.java)
            startActivity(Intent)
        }

        val aufgabenButton_2 = findViewById<Button>(R.id.btnAufgaben_2)
        aufgabenButton_2.setOnClickListener {
            val Intent = Intent(this, MagnetischeFeldAufgaben::class.java)
            startActivity(Intent)
        }

        // N*e

        val lblLK_1 = findViewById<JLatexMathView>(R.id.lblLK_1)

        var drawable = JLatexMathDrawable.builder("N * e")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

            lblLK_1.setLatexDrawable(drawable)

        // e

        val lblLK_2 = findViewById<JLatexMathView>(R.id.lblLK_2)

        drawable = JLatexMathDrawable.builder("e = -1,6 * 10^{-19}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_2.setLatexDrawable(drawable)

        // Phi

        val lblLK_3 = findViewById<JLatexMathView>(R.id.lblLK_3)

        drawable = JLatexMathDrawable.builder("\\Phi (gesprochen \\ 'Phi')")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_3.setLatexDrawable(drawable)

        // Formel für B
        val lblLK_4 = findViewById<JLatexMathView>(R.id.lblLK_4)

        drawable = JLatexMathDrawable.builder("B = \\frac{\\Phi}{A}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_4.setLatexDrawable(drawable)

        // Lorentzkraft

        val lblLK_5 = findViewById<JLatexMathView>(R.id.lblLK_5)

        drawable = JLatexMathDrawable.builder("F_{Lorentzkraft} = q * v * B")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_5.setLatexDrawable(drawable)

        // sin (alpha)

        val lblLK_6 = findViewById<JLatexMathView>(R.id.lblLK_6)

        drawable = JLatexMathDrawable.builder("sin(\\alpha)")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_6.setLatexDrawable(drawable)

        // µ(0)

        val lblLK_7 = findViewById<JLatexMathView>(R.id.lblLK_7)

        drawable = JLatexMathDrawable.builder("\\mu_{0} \\ (gesprochen \\ 'mü')")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_7.setLatexDrawable(drawable)

        // µ(0)

        val lblLK_8 = findViewById<JLatexMathView>(R.id.lblLK_8)

        drawable = JLatexMathDrawable.builder("1,257 * 10^{-6} \\frac{Vs}{Am}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_8.setLatexDrawable(drawable)

        // µ(0)

        val lblLK_9 = findViewById<JLatexMathView>(R.id.lblLK_9)

        drawable = JLatexMathDrawable.builder("\\mu_{0}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_9.setLatexDrawable(drawable)

        // B(m)

        val lblLK_10 = findViewById<JLatexMathView>(R.id.lblLK_10)

        drawable = JLatexMathDrawable.builder("B = \\mu_{0} * \\frac{n}{l} * I")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_10.setLatexDrawable(drawable)

        // mu(r)

        val lblLK_11 = findViewById<JLatexMathView>(R.id.lblLK_11)

        drawable = JLatexMathDrawable.builder("\\mu_{r}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_11.setLatexDrawable(drawable)

        // B(m)

        val lblLK_12 = findViewById<JLatexMathView>(R.id.lblLK_12)

        drawable = JLatexMathDrawable.builder("B_{m} = \\mu_{r} * B_{0}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_12.setLatexDrawable(drawable)

        // B(0)

        val lblLK_13 = findViewById<JLatexMathView>(R.id.lblLK_13)

        drawable = JLatexMathDrawable.builder("B_{0}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblLK_13.setLatexDrawable(drawable)

        // Lorentz

        val lblEoM_1 = findViewById<JLatexMathView>(R.id.lblEoM_1)

        drawable = JLatexMathDrawable.builder("F_{Lorentz} = q * v * B")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblEoM_1.setLatexDrawable(drawable)

        // Lorentz == Zentri

        val lblEoM_2 = findViewById<JLatexMathView>(R.id.lblEoM_2)

        drawable = JLatexMathDrawable.builder("F_{Lorentz} = F_{Zentripetal}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblEoM_2.setLatexDrawable(drawable)

        // F_Lorentz

        val lblEoM_3 = findViewById<JLatexMathView>(R.id.lblEoM_3)

        drawable = JLatexMathDrawable.builder("F_{Lorentz} = q * v * B")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblEoM_3.setLatexDrawable(drawable)

        // F_Zentripetalkraft

        val lblEoM_4 = findViewById<JLatexMathView>(R.id.lblEoM_4)

        drawable = JLatexMathDrawable.builder("F_{Zentripetal} = m * \\frac{v_{s}^{2}}{r}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblEoM_4.setLatexDrawable(drawable)

        // Gleichsetzen

        val lblEoM_5 = findViewById<JLatexMathView>(R.id.lblEoM_5)

        drawable = JLatexMathDrawable.builder("q * v * B = m * \\frac{v_{s}^{2}}{r}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblEoM_5.setLatexDrawable(drawable)

        // Radius

        val lblEoM_6 = findViewById<JLatexMathView>(R.id.lblEoM_6)

        drawable = JLatexMathDrawable.builder("r = \\frac{v_{s}}{B * \\frac{q}{m}}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblEoM_6.setLatexDrawable(drawable)

        // Formeln

        // Ladungen

        val lblFormeln_1 = findViewById<JLatexMathView>(R.id.lblFormeln_1)

        drawable = JLatexMathDrawable.builder("q = n * e")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblFormeln_1.setLatexDrawable(drawable)

        // Flussdichte

        val lblFormeln_2 = findViewById<JLatexMathView>(R.id.lblFormeln_2)

        drawable = JLatexMathDrawable.builder("B = \\frac{\\Phi}{A}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblFormeln_2.setLatexDrawable(drawable)

        val lblFormeln_3 = findViewById<JLatexMathView>(R.id.lblFormeln_3)

        drawable = JLatexMathDrawable.builder("B = \\mu_{r} * \\mu_{0} * \\frac{n}{l} * I")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblFormeln_3.setLatexDrawable(drawable)

        // Lorentzkraft

        val lblFormeln_4 = findViewById<JLatexMathView>(R.id.lblFormeln_4)

        drawable = JLatexMathDrawable.builder("F_{Lorentz} = q * v * B")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblFormeln_4.setLatexDrawable(drawable)

        val lblFormeln_5 = findViewById<JLatexMathView>(R.id.lblFormeln_5)

        drawable = JLatexMathDrawable.builder("F_{Lorentz} = q * v * B * sin(\\alpha)")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblFormeln_5.setLatexDrawable(drawable)

        // Radius

        val lblFormeln_6 = findViewById<JLatexMathView>(R.id.lblFormeln_6)

        drawable = JLatexMathDrawable.builder("r = \\frac{v_{s}}{B*\\frac{q}{m}}")
            .textSize(70F)
            .background(resources.getColor(R.color.transparent))
            .padding(8)
            .align(JLatexMathDrawable.ALIGN_RIGHT)
            .build()

        lblFormeln_6.setLatexDrawable(drawable)

    }
}