#include <iostream>
//#include <vector>
using namespace std;
int main() {
    vector<int> numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int num : numbers) {
        sum += num;
    }

    cout << "The sum of the numbers is: " << sum << endl;
    return 0;
}