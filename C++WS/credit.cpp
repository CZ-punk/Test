#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <algorithm>
#include "types.h"
#include "utils.h"
using namespace std;

extern vector<Lecture> all_classes_list;

class Lecture
{
public:
    string num;
    string name;
    vector<string> professor_id;
    vector<tp> tp_list;
    string credit;

    Lecture(){};
    Lecture(string num_) : num(num_) {}
    Lecture(string num_, string name_, vector<string> professor_id_)
        : num(num_), name(name_), professor_id(professor_id_) {}

    bool operator<(const Lecture &rhs) const { return num < rhs.num; }
    bool operator==(const Lecture &rhs) const { return num == rhs.num; }
    Lecture &operator=(const Lecture &rhs);
};

int getTotalCreditsForTimetable(const vector<string> &timetable, const vector<Lecture> &classes);
// total credit calculation function

int main()
{
    // timetables.txt 파일 읽기
    vector<vector<string>> all_timetables;
    ifstream file("timetables.txt");

    if (!file.is_open())
    {
        cerr << "Error opening file!" << endl;
        return 1;
    } // 파일 읽기 실패 시 에러

    string str;
    getline(file, str); // (대표)첫 라인만 읽기

    istringstream iss(str);
    vector<string> timetable;

    while (getline(iss, str, '\t'))
    {
        timetable.push_back(str);
    } // timetable 에 대표시간표 정보 저장

    // all_lecture 에 모든 강의를 저장.
    vector<Lecture> all_lecture(all_classes_list.begin(), all_classes_list.end());

    // 대표시간표의 강의들의 강의번호를 비교해서 credit 정보 합쳐서 가져오기.
    int totalCredits = getTotalCreditsForTimetable(timetable, all_lecture);

    // 결과 출력
    cout << "Total credits for selected timetable number " << timetable[0] << ": " << totalCredits << endl;

    return 0;
    // 선택한 강의 번호로 해당 강의의 credit 정보 가져오기
}

// 함수 정의
int getTotalCreditsForTimetable(const vector<string> &timetable, const vector<Lecture> &classes)
{
    int totalCredits = 0;

    if (!timetable.empty())
    {
        for (int i = 1; i < timetable.size(); i++)
        {
            string lectureNumber = timetable[i];
            auto it = find_if(classes.begin(), classes.end(),
                              [lectureNumber](const Lecture &lecture)
                              {
                                  return lecture.num == lectureNumber;
                              });
            if (it != classes.end())
            {
                totalCredits += stoi(it->credit);
            }
            else
            {
                cerr << "없는 강의번호" << endl;
            }
        }
    }
    else
    {
        cerr << "Not Timetable" << endl;
    }

    return totalCredits;
}
