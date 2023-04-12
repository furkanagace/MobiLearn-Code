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
class sinav3 : AppCompatActivity() {

    private lateinit var questionText: TextView
    private lateinit var answerOptions: RadioGroup
    private lateinit var submitButton: Button

    private var questionIndex = 0
    private var correctAnswers = 0
    private var wrongAnswers = 0

    private val questions = listOf(
        Question3(
            "Kotlin'de, aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val list = listOf(\"apple\", \"banana\", \"orange\")\n" +
                    "val result = list.joinToString(\",\") { it }\n" +
                    "print(result)\n" +
                    "}",
            "apple,banana,orange",
            "applebananaorange",
            "apple, banana, orange",
            "Compile hatası verir",
            "apple,banana,orange"
        ),
        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val set = setOf(1, 2, 3, 4, 5)\n" +
                    "println(set.first())\"}",
            "5",
            "1",
            "Hata verecektir.",
            "Çıktı garanti değil, çünkü set'lerin eleman sırası garanti değildir.",
            "1"

        ),
        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val map = mapOf(\"a\" to 1, \"b\" to 2, \"c\" to 3)\n" +
                    "val result = map.filterKeys { it == \"a\" || it == \"c\" }\n" +
                    "println(result)\n" +
                    "}",

            "{a=1, b=2, c=3}",
            "{b=2}",
            "{a=1, c=3}",
            "Hata verecektir.",
            "{a=1, c=3}"
        ),
        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
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

        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
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
        ),

        Question3(


            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val map = mapOf(\"a\" to 1, \"b\" to 2, \"c\" to 3)\n" +
                    "val result = map.mapValues { it.value * 2 }\n" +
                    "println(result)\n" +
                    "}",

            "Hata verecektir.",
            "{2=a, 4=b, 6=c}",
            "{a=1, b=2, c=3}",
            "{a=2, b=4, c=6}",
            "{a=2, b=4, c=6}"
        ),
        Question3(

            "Aşağıdaki kodun çıktısı ne olur?\n" +
                    "\n fun main() {\n" +
                    "val str1 = \"hello\"\n" +
                    "val str2 = \"hello\"\n" +
                    "println(str1 === str2)\n" +
                    "}",

            "true",
            "false",
            "compile error",
            "runtime error",
            "true"
        ),
        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val str = \"Hello, world!\"\n" +
                    "val substr = str.substring(7..11)\n" +
                    "println(substr)\n" +
                    "}",

            "Hello",
            "world",
            "Hello world",
            "runtime error",
            "world"
        ),
        Question3(

            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val list = listOf(1, 2, 3, 4, 5)\n" +
                    "val result = list.filter { it > 3 }\n" +
                    "println(result)\n" +
                    "}",

            "[3, 4, 5]",
            "[1, 2]",
            "[4, 5]",
            "compile error",
            "[4, 5]"
        ),
        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val x = \"kotlin\"\n" +
                    "val y = \"Kotlin\".toLowerCase()\n" +
                    "println(x == y)\n" +
                    "}\n",

            "true",
            "false",
            "compile error",
            "runtime error",
            "true"
        ),
        Question3(
            " Kotlin'de bir sınıfın yapıcı fonksiyonu hangi anahtar kelimeyle belirtilir?",
            "constructor",
            "init",
            " new",
            " create",
            "constructor"
        ),
        Question3(
            "Kotlin'de hangi anahtar kelime bir nesnenin null olabileceğini belirtir?",
            "nullable",
            "optional",
            "nullsafe",
            "safe",
            "safe"
        ),
        Question3(
            "Kotlin'de hangi veri tipi hem null hem de non-null değerleri tutabilir?",
            "Any",
            "Nothing",
            "Unit",
            "Nullable",
            "Nullable"
        ),
        Question3(
            "Kotlin'da, hangisi, bir nesne örneğinin türünden bağımsız olarak erişilebilen üyeleri tutmak için kullanılan bir yapıdır?",
            "Companion object",
            "Enum",
            "Interface",
            "Abstract class",
            "Interface"
        ),
        Question3(
            "Kotlin'da, hangisi, bir sınıfın diğer sınıflar tarafından alt sınıf olarak kullanılabilmesi için açıkça belirtilmesini gerektiren bir anahtar sözcüktür?",
            "open",
            "final",
            "abstract",
            "private",
            "open"
        ),

        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n" +
                    "\n fun main() {\n" +
                    "val str = \"kotlin\"\n" +
                    "val ch = 'o'\n" +
                    "println(str.contains(ch))\n" +
                    "}",
            "compile error",
            "runtime error",
            "true",
            "false",
            "true"
        ),


        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    " fun main() {\n" +
                    "val x = 10\n" +
                    "val y = 20\n" +
                    "val z = x.plus(y)\n" +
                    "println(z)\n" +
                    "}",


            "30",
            "\"30\"",
            "compile error",
            "runtime error",
            "30"
        ),

        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val list = listOf(1, 2, 3, 4, 5)\n" +
                    "val result = list.filterIndexed { index, _ -> index % 2 == 0 }\n" +
                    "println(result)\n" +
                    "}",

            "[2, 4]",
            "[1, 3, 5]",
            "[1, 2, 3, 4, 5]",
            "compile error",
            "[1, 3, 5]"


        ),
        Question3(
            "Aşağıdaki kodun çıktısı ne olur?\n\n" +
                    "fun main() {\n" +
                    "val x = 10\n" +
                    "val y = 20\n" +
                    "val z = if (x > y) x else y\n" +
                    "println(z)\n" +
                    "}",


            "10",
            "compile error",
            "20",
            "runtime error",
            "20"
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

data class Question3(
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)
