@import objects.Exam
@import java.util.*
@param ArrayList<Exam> exams
<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>
  @for(Exam exam : exams)
    <li>
      ${exam.getName()}'s score is ${exam.getGrade()},
        @if(exam.getGrade()> 90)
            grade is A
        @elseif(exam.getGrade()> 80)
            grade is B
        @elseif(exam.getGrade()> 70)
            grade is C
        @elseif(exam.getGrade()> 60)
            grade is D
        @else
            grade is F
        @endif
    </li>
    @endfor


    <a href="/">Back</a>

</body>
</html>