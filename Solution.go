
package main

import (
    "fmt"
    "reflect"
)

func wiggleSort(input []int) {
    swap := reflect.Swapper(input)

    for i := 1; i < len(input); i += 2 {
        if input[i - 1] > input[i] {
            swap(i - 1, i)
        }
        if i + 1 < len(input) && input[i + 1] > input[i] {
            swap(i + 1, i)
        }
    }
}
