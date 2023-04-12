package com.furkanagace.mobilearncode

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
class sinav1 : AppCompatActivity() {

    private lateinit var questionText: TextView
    private lateinit var answerOptions: RadioGroup
    private lateinit var submitButton: Button

    private var questionIndex = 0
    private var correctAnswers = 0
    private var wrongAnswers = 0

    private val questions = listOf(
        Question1(
            "Kotlin programlama dilinde hangisi bir koşul ifadesidir?",
            "if",
            "while",
            "for",
            "switch",
            "if"
        ),

        Question1(
            "Kotlin programlama dilinde hangisi, bir sınıfın üyelerine erişmek için kullanılan özel bir anahtar sözcüktür?",
            "this",
            "super",
            "public",
            "private",
            "private"
        ),
        Question1(
            "Hangisi, Kotlin'da bir String değişkeninin içindeki karakter sayısını veren bir metoddur?",
            "length()",
            "count()",
            "size()",
            "len()",
            "length()"
        ),
        Question1(
            "Hangisi, Kotlin'da bir dizinin boyutunu belirten bir özelliktir?",
            "size",
            "length",
            "count",
            "index",
            "size"
        ),
        Question1(
            "Hangisi, Kotlin'da bir dizinin belirli bir indeksindeki öğeyi almak için kullanılan bir metottur?",
            "get()",
            "set()",
            "elementAt()",
            "retrieve()",
            "get()"
        ),
        Question1(
            "Hangisi, Kotlin'da bir sınıfın başka bir sınıftan kalıtım almasını sağlayan bir anahtar sözcüktür?",
            "extends",
            "implements",
            "super",
            "class",
            "extends"
        ),
        Question1(
            "Hangisi, Kotlin'da bir değişkenin değerini değiştirirken kullanılan bir operatördür?",
            "++",
            "--",
            "+=",
            "-=",
            "+="
        ),
        Question1(
            "Hangisi, Kotlin'da bir sınıfın başka bir sınıfın özelliklerini ve metodlarını miras almasını sağlayan bir mekanizmadır?",
            "inheritance",
            "encapsulation",
            "polymorphism",
            "abstraction",
            "inheritance"
        ),
        Question1(
            "Soru: Aşağıdakilerden hangisi Kotlin'da bir \"nullable\" değişkeni güvenli bir şekilde kullanmak için kullanılan bir operatördür?",
            "!",
            "?",
            "!!",
            "~",
            "?",
        ),
        Question1(
            "Hangisi, Kotlin'da bir sınıfın belirli bir sınıfı genişletmesi için kullanılan bir anahtar sözcük değildir?",
            "extends",
            "implements",
            "open",
            "abstract",
            "open"
        ),
        Question1(
            "Kotlin'da, bir nesnenin geçici bir durumunu tutmak için kullanılan anahtar sözcük hangisidir?",
            "var",
            "val",
            "const",
            "lateinit",
            "lateinit"
        ),
        Question1(
            "Aşağıdakilerden hangisi, Kotlin'da bir işlevin varsayılan argüman değerlerini belirlemek için kullanılan anahtar sözcüklerden biridir?",
            "default",
            "override",
            "const",
            "this",
            "default"
        ),
        Question1(
            "Aşağıdakilerden hangisi, Kotlin'da bir işlevin bir üst sınıfın işleviyle aynı isme sahip olabileceği durumda kullanılan anahtar sözcüktür?",
            "override",
            "extend",
            "implements",
            "abstract",
            "override"
        ),
        Question1(
            "Kotlin'da, hangi işlev türü, başka bir işlevi parametre olarak alabilir?",
            "Higher-order functions",
            "Lambda functions",
            "Infix functions",
            "Extension functions",
            "Higher-order functions"
        ),
        Question1(
            "Aşağıdakilerden hangisi, Kotlin'da sınıflar arasında veri paylaşmak için kullanılan bir veri türüdür?",
            "Companion object",
            "Enum",
            "Interface",
            "Abstract class",
            "Companion object"
        ),
        Question1(
            "Kotlin'da, bir sınıfın yanıtlayabileceği belirli bir mesaj türünü tanımlamak için kullanılan bir arayüz hangisidir?",
            "Interface",
            "Abstract class",
            "Companion object",
            "Enum",
            "Companion object"
        ),
        Question1(
            "Kotlin'da, hangisi, bir nesne örneğinin türünden bağımsız olarak erişilebilen üyeleri tutmak için kullanılan bir yapıdır?",
            "Companion object",
            "Enum",
            "Interface",
            "Abstract class",
            "Interface"
        ),
        Question1(
            "Kotlin'da, hangisi, bir sınıfın diğer sınıflar tarafından alt sınıf olarak kullanılabilmesi için açıkça belirtilmesini gerektiren bir anahtar sözcüktür?",
            "open",
            "final",
            "abstract",
            "private",
            "open"
        ),
        Question1(
            "Aşağıdakilerden hangisi, Kotlin'da bir sınıfın birden fazla arayüzü uygulayabileceği anlamına gelir?",
            "Multiple interface inheritance",
            "Single interface inheritance",
            "Multiple class inheritance",
            "Single class inheritance",
            "Multiple interface inheritance"
        ),
        Question1(   "Aşağıdakilerden hangisi, Kotlin'da \"when\" ifadesi kullanarak bir dizi durum kontrolü yapmak için kullanılan bir anahtar kelime değildir?",
            " else",
            " case",
            " is",
            " in",
            " case"
        )
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sinav1)

        questionText = findViewById(R.id.question_text)
        answerOptions = findViewById(R.id.answer_options)
        submitButton = findViewById(R.id.submit_button)

        showQuestion() // İlk soruyu göster

        submitButton.setOnClickListener {
            checkAnswer()
            if (questionIndex < questions.size - 1) {
                questionIndex++
                showQuestion()
            } else {
                showResult()
            }
        }
    }

    private fun showQuestion() {
        val question = questions[questionIndex]
        questionText.text = question.text
        val options = listOf(
            Pair(answerOptions.getChildAt(0) as RadioButton, question.option1),
            Pair(answerOptions.getChildAt(1) as RadioButton, question.option2),
            Pair(answerOptions.getChildAt(2) as RadioButton, question.option3),
            Pair(answerOptions.getChildAt(3) as RadioButton, question.option4)
        )
        answerOptions.clearCheck()
        options.forEach { (option, text) ->
            option.apply {
                this.text = text
                setTextColor(Color.WHITE)
                isChecked = false
                setOnCheckedChangeListener { button, isChecked ->
                    if (isChecked) {
                        options.forEach { (otherOption, otherText) ->
                            if (otherOption != button) {
                                otherOption.setTextColor(Color.WHITE)
                            } else {
                                button.setTextColor(if (text == question.correctAnswer) Color.GREEN else Color.RED)
                            }
                        }
                    }
                }
            }
        }
    }

    private var emptyAnswers = 0

    private fun checkAnswer() {
        val selectedOptionId = answerOptions.checkedRadioButtonId
        if (selectedOptionId != -1) {
            val selectedOption = findViewById<RadioButton>(selectedOptionId)
            if (selectedOption.text == questions[questionIndex].correctAnswer) {
                correctAnswers++
            } else {
                wrongAnswers++
            }
        } else {
            emptyAnswers++
        }
    }


    @SuppressLint("SetTextI18n")
    private fun showResult() {
        questionText.visibility = View.GONE
        answerOptions.visibility = View.GONE
        submitButton.visibility = View.GONE

        val resultText = findViewById<TextView>(R.id.result_text)
        resultText.visibility = View.VISIBLE
        resultText.text = "Doğru cevaplar: $correctAnswers\nYanlış cevaplar: $wrongAnswers\nBoş cevaplar: $emptyAnswers"


        val backButton = findViewById<Button>(R.id.back_button)
        backButton.visibility = View.VISIBLE
        backButton.setOnClickListener {
            finish()
        }
    }
}

data class Question1(
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)
