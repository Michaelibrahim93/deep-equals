package com.mi93.deepequalslib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = generateDeepEqualsString()
    }

    private fun generateDeepEqualsString(): CharSequence {
        val object1_1 = createComplexObject(1)
        val object1_2 = createComplexObject(1)
        val object2_1 = createComplexObject(2)
        return StringBuilder()
            .append("deepEquals(object1_1, object1_2) ").append(Objects.deepEquals(object1_1, object1_2))
            .append("\n")
            .append("deepEquals(object1_1, object2_1) ").append(Objects.deepEquals(object1_1, object2_1))
            .append("\n")
            .append("object1_1 == object2_1 ").append(object1_1 == object2_1)
    }

    private fun createComplexObject(num: Int): ComplexObject {
        return ComplexObject(
            3,
            createSimpleObject(num),
            listOf(createSimpleObject(num + 1), createSimpleObject(num + 2)),
            mapOf(
                (num + 1).toLong() to createSimpleObject(num + 1),
                (num + 2).toLong() to createSimpleObject(num + 2),
                (num + 3).toLong() to createSimpleObject(num + 3)
            )
        )
    }

    private fun createSimpleObject(num: Int): SimpleObject {
        return SimpleObject(
            num.toString(),
            num.toDouble(),
            num,
            num.toFloat()
        )
    }
}