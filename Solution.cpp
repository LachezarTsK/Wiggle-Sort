
#include <vector>
#include <utility>
using namespace std;

class Solution {

public:
    void wiggleSort(vector<int>& input) const {
        for (size_t i = 1; i < input.size(); i += 2) {
            if (input[i - 1] > input[i]) {
                swap(input[i - 1], input[i]);
            }
            if (i + 1 < input.size() && input[i + 1] > input[i]) {
                swap(input[i + 1], input[i]);
            }
        }
    }
};
