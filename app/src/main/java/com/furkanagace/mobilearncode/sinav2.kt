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
class sinav2 : AppCompatActivity() {

    private lateinit var questionText: TextView
    private lateinit var answerOptions: RadioGroup
    private lateinit var submitButton: Button

    private var questionIndex = 0
    private var correctAnswers = 0
    private var wrongAnswers = 0

    private val questions = listOf(
        Question2(
            "Kotlin programlama dili hangi şirket tarafından geliştirilmiştir?",
            "Google",
            "Microsoft",
            "Apple",
            "IBM",
            "Google"
        ),

        Question2(
            "Kotlin, hangi programlama dilleriyle aynı sanal makine üzerinde çalışabilir?",
            "Java",
            "C#",
            "Python",
            "Ruby",
            "Java"
        ),

        Question2(

            "Kotlin'de hangi anahtar kelime sınıfların kalıtımını engeller?",
            "final",
            "abstract",
            "open",
            "sealed",
            "final"

        ),
        Question2(

            "Bir fonksiyonun geri dönüş değeri hangi Kotlin anahtar kelimesiyle belirtilir?",
            " return",
            "result",
            "yield",
            "output",
            " return"

        ),
        Question2(
            " Kotlin'de bir sınıfın yapıcı fonksiyonu hangi anahtar kelimeyle belirtilir?",
            "constructor",
            "init",
            " new",
            " create",
            "constructor"
        ),
        Question2(
            "Kotlin'de hangi anahtar kelime bir nesnenin null olabileceğini belirtir?",
            "nullable",
            "optional",
            "nullsafe",
            "safe",
            "safe"
        ),
        Question2(
            "Kotlin'de hangi veri tipi hem null hem de non-null değerleri tutabilir?",
            "Any",
            "Nothing",
            "Unit",
            "Nullable",
            "Nullable"
        ),

        Question2(
            "Kotlin'da, hangisi, bir sınıfın diğer sınıflar tarafından alt sınıf olarak kullanılabilmesi için açıkça belirtilmesini gerektiren bir anahtar sözcüktür?",
            "open",
            "final",
            "abstract",
            "private",
            "open"
        ),
        Question2(
            "Kotlin'de hangi veri tipi bir fonksiyonun geri dönüş değeri olmayacak şekilde işaretlenir?",
            "Unit",
            "Void",
            "Nothing",
            "Empty",
            "Nothing"

        ),
        Question2(
            "Kotlin'de hangi anahtar kelime döngülerin veya koşullu ifadelerin içindeki bir kod bloğunu işaretlemek için kullanılır?",
            "block",
            "code",
            "brace",
            "scope",
            "brace"
        ),
        Question2(
            "Hangi Kotlin anahtar kelimesi bir nesnenin veri üyelerine erişimini sınırlayabilir?",
            "private",
            "public",
            "protected",
            "internal",
            "private"
        ),
        Question2(
            "Kotlin'de bir dizi oluşturmak için hangi anahtar kelime kullanılır?",
            "array",
            "list",
            "set",
            "map",
            "list"
        ),
        Question2(
            "Kotlin'de hangi anahtar kelime değişkenlerin değerini değiştirmeye izin vermez?",
            "final",
            "const",
            "static",
            "read only",
            "final"
        ),
        Question2(
            "Kotlin'de hangi anahtar kelime bir değişkenin değerini değiştirmek için kullanılır?",
            "set",
            "put",
            "assign",
            "field",
            "set"
        ),
        Question2(
            "Kotlin programlama dilinde hangisi bir koşul ifadesidir?",
            "if",
            "while",
            "for",
            "switch",
            "if"
        ),
        Question2(
            "Kotlin programlama dilinde hangisi, bir sınıfın üyelerine erişmek için kullanılan özel bir anahtar sözcüktür?",
            "this",
            "super",
            "public",
            "private",
            "private"
        ),
        Question2(
            "Hangisi, Kotlin'da bir String değişkeninin içindeki karakter sayısını veren bir metoddur?",
            "length()",
            "count()",
            "size()",
            "len()",
            "length()"
        ),
        Question2(
            "Hangisi, Kotlin'da bir dizinin boyutunu belirten bir özelliktir?",
            "size",
            "length",
            "count",
            "index",
            "size"
        ),

        Question2(
            "Aşağıdaki kodun çıktısı ne olur?\n" +
                    "fun main() {\n" +
                    "val list = listOf(1, 2, 3, 4, 5)\n" +
                    "val result = list.map { it * 2 }.filter { it > 5 }\n" +
                    "println(result)\n" +
                    "}",
            "[6, 8, 10]",
            "[3, 4, 5, 6, 7, 8, 9, 10]",
            "[1, 2, 3, 4, 5]",
            "Hata verecektir.",
            "[6, 8, 10]"
        ),

        Question2(
            "Aşağıdaki kodun çıktısı ne olur?\n" +
                    "fun main() {\n" +
                    "val str = \"Merhaba Kotlin!\"\n" +
                    "val result = str.slice(0..6)\n" +
                    "println(result)\n" +
                    "}",

            "Merhaba Kotlin!",
            "Kotlin",
            "Merhaba",
            "Hata verecektir.",
            "Merhaba"
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

data class Question2(
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)
