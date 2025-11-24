document.addEventListener('DOMContentLoaded', function () {

    let facil = document.getElementById('1');

    let pointerEvent = new PointerEvent('click', {
        bubbles: true,
        cancelable: true,
        view: window,
    });
    facil.dispatchEvent(pointerEvent);
});

document.addEventListener('DOMContentLoaded', () => {

    const inputField = document.getElementById('palavraDigitada');
    const keys = document.querySelectorAll('.key');

    keys.forEach(key => {

        key.addEventListener('click', () => {

            const keyValue = key.textContent;

            if (key.classList.contains('backspace')) {
                inputField.value = inputField.value.slice(0, -1);
            } else {
                inputField.value += keyValue;
            }

        });
    });

});

let facil = document.getElementById('1');
let medio = document.getElementById('2');
let dificil = document.getElementById('3');

facil.addEventListener('click', embaralharFunc);
medio.addEventListener('click', embaralharFunc);
dificil.addEventListener('click', embaralharFunc);

var input;
var palavraA;
var palavraN;
var numTentativas;

function embaralharFunc(n) {

    console.log(n);

    console.log("oi");

    let p = document.querySelector('.palavra-embaralhada');
    p.textContent = "";

    let lugarId = document.querySelector('#lugar-id');

    input = document.getElementById('palavraDigitada');
    input.value = "";

    let elemento = n.target;

    const menuOptions = document.querySelectorAll('.nav-link');

    menuOptions.forEach(option => {
        option.classList.remove('active');
        option.style.color = '#95B0B2';
    });

    n.target.classList.add('active');
    n.target.style.color = 'rgb(194, 89, 106)';

    let id = elemento.id;
    let idL = BigInt(id);

    fetch(`http://localhost:8080/niveis/pesquisar/${idL}`)

        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na resposta: ' + response.statusText);
            }
            return response.json();
        })
        .then(nivel => {

            numTentativas = nivel.tentativa;
            console.log(numTentativas)

        })
        .catch(error => console.error('Erro:', error));


    fetch(`http://localhost:8080/palavras/embaralhar/${idL}`)

        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na resposta: ' + response.statusText);
            }
            return response.json();
        })
        .then(lista => {

            palavraN = lista[0].toUpperCase();
            console.log(palavraN);
            p.append(palavraN.split('').join(' '));
            palavraA = lista[1].toUpperCase();
            lugarId.innerHTML = lista[2];

            //verificar(lista);
            lista.forEach(string => {
                console.log("Elemento:", string);
            });

        })
        .catch(error => console.error('Erro:', error));

}

// pra enviar a palavra quando teclar enter
document.addEventListener("keydown", function (event) {
    if (event.key === "Enter" || event.keyCode === 13) {
        event.preventDefault();
        envioPalavra();
    }
});

//para enviar a palavra quando clicar nos botoes de enter
document.getElementById("bt-enviar").addEventListener('click', envioPalavra);
document.getElementById('tec-enviar').addEventListener('click', envioPalavra);

function envioPalavra() {
    let adv = input.value;
    adv = adv.trim().toUpperCase();
    console.log(adv);

    if (adv === '') {
        Swal.fire({
            icon: "error",
            title: "Oops...",
            text: "Campo vazio. Digite algo!"
        });
        return;
    }

    if (adv.localeCompare(palavraA) === 0) {
        console.log("acertou");
        Swal.fire({
            icon: "success",
            title: "Boa!!",
            text: "Você acertou! Parabéns."
        }).then((result) => {
            let nivel = document.getElementsByClassName('active')[0];
            let pointerEvent = new PointerEvent('click', {
                bubbles: true,
                cancelable: true,
                view: window,
            });
            nivel.dispatchEvent(pointerEvent);
        });
    } else {
        numTentativas--;
        console.log(numTentativas);

        if (numTentativas > 0) {
            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: `Você errou! Tente novamente. Tentativas restantes: ${numTentativas}`
            });
        } else {
            Swal.fire({
                icon: "error",
                title: "Fim de Jogo",
                text: "Você não tem mais tentativas! A palavra era: " + palavraA
            }).then((result) => {
                let nivel = document.getElementsByClassName('active')[0];
                let pointerEvent = new PointerEvent('click', {
                    bubbles: true,
                    cancelable: true,
                    view: window,
                });
                nivel.dispatchEvent(pointerEvent);
            });
        }
    }

}

let btDica = document.getElementById('bt-dica');
btDica.addEventListener('click', dica);

function dica(e) {

    e.preventDefault();

    console.log(e);

    let nivel = document.getElementsByClassName('active')[0];
    console.log(nivel);

    nivel = nivel.id;
    console.log(nivel);

    let id = document.querySelector('#lugar-id').textContent;
    console.log(id);

    let idL = BigInt(id);

    fetch(`http://localhost:8080/palavras/pesquisar/${idL}`)

        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na resposta: ' + response.statusText);
            }
            return response.json();
        })

        .then(palavra => {

            console.log(palavra);

            let tema = palavra.tema.tema;
            console.log(tema);

            let balao = document.getElementById('balaoTexto');
            balao.textContent = tema.toUpperCase();
            console.log(balao);
            balao.style.display = 'block';

            // aparecer por 5 seg apenas
            setTimeout(function () {
                balao.style.display = 'none';
            }, 5000);

        })

        .catch(error => console.error('Erro:', error));

}
