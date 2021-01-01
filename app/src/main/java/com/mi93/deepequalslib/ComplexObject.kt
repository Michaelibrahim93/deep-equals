package com.mi93.deepequalslib

data class ComplexObject(
    val id: Long,
    val simpleObject: SimpleObject,
    val list: List<SimpleObject>,
    val map: Map<Long, SimpleObject>
) {
    override fun equals(other: Any?): Boolean {
        if (other !is ComplexObject) return false
        return id == other.id
    }
}
