# SavedInstanceState

Ilgari hecham e'tibor bermagandim, lekin screen rotate bo'lganida classdagi ma'lumotlar yo'qolarkan.
Bu narsani SavedInstanceState mavzusiga kelib angladim, va 3 ta activityda kod yozib ko'rdim:

1. UnsavedState - hech narsa saqlanmaydi, screen rotate bo'lganida ma'lumot o'chib ketadi
2. SavedState - taklif qilingan usul, savedInstanceStatega saqlash
3. CompanionState - qizig'i companionda ham ma'lumotlar o'chib ketmas ekan,
savedInstanceState bilan farqini sezganim yo'q

## Qo'shimcha

Afsuski bu narsani murakkab ma'lumotlarni saqlashda qo'llab bo'lmaydi,
masalan view larda startAnimation chaqirilgan holda screen rotate bo'lsa
animatsiya holati ham o'chib ketadi

## Xulosa
Jetpack Composeda baribir bu narsalarga duch kelmayman, shuning uchun chuqur izlanib o'tirmadim 😁
