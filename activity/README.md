# Android Activity Lifecycle researching...

🔹 onCreate() → Activity yaratildi (bir martalik ishlar shu yerda qilinadi).

🔹 onStart() → Activity ekranda paydo bo‘ldi.

🔹 onResume() → Activity to‘liq ekranga chiqdi va foydalanuvchi bilan o‘zaro aloqada bo‘lishga tayyor.

🔹 onPause() → Activity vaqtinchalik to‘xtadi (masalan, boshqa ekranga o‘tildi).

🔹 onStop() → Activity ekrandan butunlay yo‘qoldi.

🔹 onDestroy() → Activity butunlay yo‘q qilindi.

# shaxsiy xulosa

* onDestroy fonda uzoq qolib ketsa chaqirilmay qolarkan
* onPause, onStop tizim tomonidan dastur to'xtatilsa chaqirilmaydi

# Amaliyot

* onPause, onStop, onDestroyga ishonib qolish kerak emas, xavf yuqori bo'lsa sinxronizatsiyadan ko'proq foydalangan yaxshi, agar xavf kam bo'lsa ulardan foydalanish mumkin

# So'z oxiri

Bu shaxsiy izlanish asosida yozilayotgan narsa va xato xulosalar ham bo'lishi mumkin, agar siz biror xatoni topsangiz xabar bering :)
