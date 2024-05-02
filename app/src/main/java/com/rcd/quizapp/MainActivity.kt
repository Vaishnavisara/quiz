package com.rcd.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var option1: Button? = null
    var option2: Button? = null
    var option3: Button? = null
    var option4: Button? = null
    var isPressed: Boolean = true
    var correctAnswer: String? = null
    var choosedAnswer: Button? = null
    var findText: TextView? = null
    var index: Int = 0
    var image: ImageView? = null
    var option6:Button?=null
    var score : Int = 0
//    var questionsList:String?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        option1 = findViewById(R.id.button1)
        option2 = findViewById(R.id.button2)
        option3 = findViewById(R.id.button3)
        option4 = findViewById(R.id.button4)
        findText = findViewById(R.id.textView1)
        image = findViewById(R.id.imageview1)
        option6=findViewById(R.id.button6)


        var questionList = listOf(
            listOf("1.lavender", "2.jasmine", "3.sunflower", "4.hibiscus", "1.lavender"),
            listOf("1.lavender", "2.jasmine", "3.sunflower", "4.hybiscus", "3.sunflower"),
            listOf("1.lotus", "2.rose", "3.jasmine", "4.sunflower", "2.rose"),
//            listOf("1.marie gold", "2.dahlia", "3.hibiscus", "4.sunflower", "2.dahlia"),
            listOf("1.dahlia", "2.hibiscus", "3.sunflower","4.lilly","4.lilly"),
            listOf("1.dahlia","2.lotus","3.jasmine","4.marigold","3.jasmine"),
            listOf("1.lotus","2.jasmine","3.rose","4.marigold","4.marigold")
        )

        var imageArray = listOf(
            R.drawable.lavender,
            R.drawable.sunflower,
            R.drawable.rose,
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.marigold
        )

        option1?.text = questionList[index][0]
        option2?.text = questionList[index][1]
        option3?.text = questionList[index][2]
        option4?.text = questionList[index][3]

        correctAnswer = questionList[index][4]

        image?.setImageResource(imageArray[index])

    }


    fun quetion(view: View) {
        index++
        isPressed = true
        var questionList = listOf(
            listOf("1.lavender", "2.jasmine", "3.sunflower", "4.hibiscus", "1.lavender"),
            listOf("1.lavender", "2.jasmine", "3.sunflower", "4.hibiscus", "3.sunflower"),
            listOf("1.lotus", "2.rose", "3.jasmine", "4.sunflower", "2.rose"),
//            listOf("1.marie gold", "2.dahlia", "3.hibiscus", "4.sunflower", "2.dahlia"),
            listOf("1.dahlia", "2.hibiscus", "3.sunflower","4.lilly","4.lilly"),
            listOf("1.dahlia","2.lotus","3.jasmine","4.marigold","3.jasmine"),
            listOf("1.lotus","2.jasmine","3.rose","4.marigold","4.marigold")
        )
        option6?.setText("submit")
        var imageArray = listOf(
            R.drawable.lavender,
            R.drawable.sunflower,
            R.drawable.rose,
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.marigold
        )


        option1?.text = questionList[index][0]
        option2?.text = questionList[index][1]
        option3?.text = questionList[index][2]
        option4?.text = questionList[index][3]

        correctAnswer = questionList[index][4]

        image?.setImageResource(imageArray[index])
    }


    fun onColorChange1(view: View) {
//        choosedAnswer=option1
        if (isPressed) {
            choosedAnswer = option1
//            choosedAnswer=option1?.text.toString()
            option1?.setBackgroundColor(Color.BLUE)
            option2?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)

//            option1?.isPressed=false
        } else {
            option1?.setBackgroundColor(Color.WHITE)
            option2?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)


//            isPressed = true
        }
    }

    //    var isPressed = true
    fun onColorChange2(view: View) {

        if (isPressed) {
            choosedAnswer = option2

//            choosedAnswer=option2?.text.toString()
            option2?.setBackgroundColor(Color.BLUE)
            option1?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)
//            isPressed = false
        } else {
            option1?.setBackgroundColor(Color.WHITE)
            option2?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)
        }
    }

    fun onColorChange3(view: View) {

        if (isPressed) {
            choosedAnswer = option3
//            choosedAnswer=option3?.text.toString()
            option3?.setBackgroundColor(Color.BLUE)
            option2?.setBackgroundColor(Color.WHITE)
            option1?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)
//            isPressed = false;
        } else {
            option1?.setBackgroundColor(Color.WHITE)
            option2?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)
        }
    }

    fun onColorChange4(view: View) {

        if (isPressed) {
            choosedAnswer = option4

//            choosedAnswer=option4?.text.toString()
            option4?.setBackgroundColor(Color.BLUE)
            option2?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option1?.setBackgroundColor(Color.WHITE)
//            isPressed = false;
        } else {
            option1?.setBackgroundColor(Color.WHITE)
            option2?.setBackgroundColor(Color.WHITE)
            option3?.setBackgroundColor(Color.WHITE)
            option4?.setBackgroundColor(Color.WHITE)
//            isPressed = true;
        }
    }

    fun clear(view: View) {
        option1?.setBackgroundColor(Color.WHITE)
        option2?.setBackgroundColor(Color.WHITE)
        option3?.setBackgroundColor(Color.WHITE)
        option4?.setBackgroundColor(Color.WHITE)
//        isPressed=true
//        index++
        quetion(view)

    }

    fun submit(view: View) {

        if(option6?.text=="submit") {
            if (isPressed) {
                isPressed = false
                if (correctAnswer == choosedAnswer?.text) {
                    choosedAnswer?.setBackgroundColor(Color.GREEN)
                    score++
                } else {

                    choosedAnswer?.setBackgroundColor(Color.RED)
                    if (option1?.text == correctAnswer) {
                        option1?.setBackgroundColor(Color.GREEN)
                    }
                    if (option2?.text == correctAnswer) {
                        option2?.setBackgroundColor(Color.GREEN)
                    }
                    if (option3?.text == correctAnswer) {
                        option3?.setBackgroundColor(Color.GREEN)
                    }
                    if (option4?.text == correctAnswer) {
                        option4?.setBackgroundColor(Color.GREEN)
                    }

                }
                option6?.setText("next")


            }
        }
        else{
            clear(view)

        }
        if(index==5){
            if(score>=4){
                setContentView(R.layout.activity_main2)
            }
            else{
                setContentView(R.layout.activity_main3)
            }
        }
    }
    fun yes(view: View){
        setContentView(R.layout.activity_main)
        index=0
        score=0
        quetion(view)
    }

}






