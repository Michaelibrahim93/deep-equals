package com.mi93.deepequalslib

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mi93.deepequalslib.models.JComplexObject
import com.mi93.deepequalslib.models.JSimpleObject
import com.mi93.deepequalslib.models.KComplexObject
import com.mi93.deepequalslib.models.KSimpleObject
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "${generateDeepEqualsString()} \n\n ${generateJDeepEqualsString()}"
    }

    private fun generateDeepEqualsString(): CharSequence {
        val object1_1 = createComplexObject(1)
        val object1_2 = createComplexObject(1)
        val object2_1 = createComplexObject(2)
        return StringBuilder()
            .append("deepEquals(object1_1, object1_2) ").append(DeepEquals.deepEquals(object1_1, object1_2))
            .append("\n")
            .append("deepEquals(object1_1, object2_1) ").append(DeepEquals.deepEquals(object1_1, object2_1))

    }

    private fun generateJDeepEqualsString(): CharSequence {
        val object1_1 = createJComplexObject(1)
        val object1_2 = createJComplexObject(1)
        val object2_1 = createJComplexObject(2)
        return StringBuilder()
            .append("deepEquals(object1_1, object1_2) J: ").append(DeepEquals.deepEquals(object1_1, object1_2))
            .append("\n")
            .append("deepEquals(object1_1, object2_1) J: ").append(DeepEquals.deepEquals(object1_1, object2_1))
    }

    private fun createComplexObject(num: Int): KComplexObject {
        return KComplexObject(
            3,
            createSimpleObject(num),
            listOf(createSimpleObject(num + 1), createSimpleObject(num + 2)),
            mapOf(
                (num + 1).toLong() to createSimpleObject(num + 1),
                (num + 2).toLong() to createSimpleObject(num + 2),
                (num + 3).toLong() to createSimpleObject(num + 3)
            ),
            arrayOf(createSimpleObject(num + 1), createSimpleObject(num + 2)),
            arrayOf(num, num+1, num+2)
        )
    }

    private fun createSimpleObject(num: Int): KSimpleObject {
        return KSimpleObject(
            num.toString(),
            num.toDouble(),
            num,
            num.toFloat()
        )
    }

    private fun createJComplexObject(num: Int): JComplexObject {
        return JComplexObject(
            3,
            createJSimpleObject(num),
            listOf(createJSimpleObject(num + 1), createJSimpleObject(num + 2)),
            mapOf(
                (num + 1).toLong() to createJSimpleObject(num + 1),
                (num + 2).toLong() to createJSimpleObject(num + 2),
                (num + 3).toLong() to createJSimpleObject(num + 3)
            ),
            arrayOf(createJSimpleObject(num + 1), createJSimpleObject(num + 2)),
            intArrayOf(num, num+1, num+2)
        )
    }

    private fun createJSimpleObject(num: Int): JSimpleObject {
        return JSimpleObject(
            num.toString(),
            num.toDouble(),
            num,
            num.toFloat()
        )
    }
}