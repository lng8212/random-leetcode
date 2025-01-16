#include <bits/stdc++.h>
// https://leetcode.com/problems/number-of-valid-clock-times/description
using namespace std;

#define ios_base_sync_off    \
    ios::sync_with_stdio(0); \
    cin.tie(0);
#define REP(i, n) for (int i = 0; i < (n); i++)
#define REPL(i, n) for (int i = n - 1; i >= 0; i--)
#define FOR(i, a, b) for (int i = (a); i < (b); i++)
#define INF 1e9
#define MOD 1000000007
#define ABS(x) ((x) < 0 ? -(x) : (x))
#define MAX(a, b) ((a) > (b) ? (a) : (b))
#define MIN(a, b) ((a) < (b) ? (a) : (b))
#define dbg(x) cout << #x << " = " << x << endl

typedef long long ll;
typedef pair<int, int> pii;
typedef vector<int> vi;
typedef vector<vi> vvi;

int solve(string s) {
    int totalChoice = 1;
    if (s[0] == '?') {
        if (s[1] == '?') {
            totalChoice *= 24;
        } else {
            if (s[1] < '4') {
                totalChoice *= 3;
            } else
                totalChoice *= 2;
        }
    }
    if (s[1] == '?' && s[0] != '?') {
        if (s[0] == '2') {
            totalChoice *= 4;
        } else
            totalChoice *= 10;
    }

    if (s[3] == '?') {
        totalChoice *= 6;
    }
    if (s[4] == '?') {
        totalChoice *= 10;
    }
    return totalChoice;
}

int main() {
    ios_base_sync_off string s;
    cin >> s;
    cout << solve(s) << endl;
    return 0;
}