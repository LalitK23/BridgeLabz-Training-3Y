let count = 0;

function counter() {
    function increment() {
        count++;
        console.log(count);
    }
    function decrement() {
        count--;
        console.log(count);
    }
    increment();
    increment();
    decrement();
}

counter();
counter();
