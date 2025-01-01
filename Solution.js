
/**
 * @param {number[]} input
 * @return {void} 
 */
var wiggleSort = function (input) {
    for (let i = 1; i < input.length; i += 2) {
        if (input[i - 1] > input[i]) {
            [input[i - 1], input[i]] = [input[i], input[i - 1]];
        }
        if (i + 1 < input.length && input[i + 1] > input[i]) {
            [input[i + 1], input[i]] = [input[i], input[i + 1]];
        }
    }
};
