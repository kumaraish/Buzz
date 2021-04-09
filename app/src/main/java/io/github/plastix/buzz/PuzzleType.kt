package io.github.plastix.buzz

enum class PuzzleType(val stringKey: String) {
    DOWNLOADED("downloaded"),
    GENERATED("generated");

    companion object {
        fun fromStringKey(key: String?): PuzzleType {
            return values().firstOrNull { it.stringKey == key } ?: DOWNLOADED
        }
    }
}