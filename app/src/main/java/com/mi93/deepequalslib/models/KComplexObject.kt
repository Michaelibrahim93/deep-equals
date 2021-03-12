package com.mi93.deepequalslib.models

data class KComplexObject(
    val id: Long,
    val simpleObject: KSimpleObject,
    val list: List<KSimpleObject>,
    val map: Map<Long, KSimpleObject>,
    val oArr: Array<KSimpleObject>,
    val iArr: Array<Int>
) {
    override fun equals(other: Any?): Boolean {
        if (other !is KComplexObject) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + simpleObject.hashCode()
        result = 31 * result + list.hashCode()
        result = 31 * result + map.hashCode()
        return result
    }
}
