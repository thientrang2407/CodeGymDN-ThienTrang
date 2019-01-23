
const GAMEBOARD_WIDTH = 500;
const GAMEBOARD_HEIGHT = 1000;

const ORIENTATION_LEFT = "left";
const ORIENTATION_RIGHT = "right";
const ORIENTATION_UP = "up";
const ORIENTATION_DOWN = "down";

const CAR_WIDTH = 50;
const CAR_HEIGHT = 30;

const DEFAULT_CAR_X_POSITION = 100;
const DEFAULT_CAR_Y_POSITION = 100;
const DEFAULT_CAR_ORIENTATION = ORIENTATION_DOWN;
const DEDAULT_CAR_SPEED = 20;

function Car() {
    this.xPosition = DEFAULT_CAR_X_POSITION;
    this.yPosition = DEFAULT_CAR_Y_POSITION;
    this.orientation = DEFAULT_CAR_ORIENTATION;
    this.speed = DEDAULT_CAR_SPEED;
    this.step = 1;

    this.buildImage = function () {
        // this.image = this.orientation + this.step + '.jpg';
        this.image = 'car.jpg';
    };

    this.buildImage();

    this.move = function () {
        switch (this.orientation) {
            case ORIENTATION_DOWN:
                this.yPosition += this.speed;
                break;
            case ORIENTATION_UP:
                this.yPosition -= this.speed;
                break;
            case ORIENTATION_LEFT:
                this.xPosition -= this.speed;
                break;
            case ORIENTATION_RIGHT:
                this.xPosition += this.speed;
                break;
        }

        if (this.step === 2) {
            this.step = 1;
        } else {
            this.step = 2;
        }
        this.buildImage();
    };

    this.turn = function (orientation) {
        this.orientation = orientation;
        this.step = 1;
        this.buildImage();
    };

    this.show = function (ctx) {
        var image = new Image();
        var xPosition = this.xPosition;
        var yPosition = this.yPosition;
        image.onload = function () {
            ctx.drawImage(image, xPosition, yPosition, CAR_WIDTH, CAR_HEIGHT);
        };
        image.src = "./" + this.image;
    }
}

function GameBoard() {
    this.car = new Car();
    this.ctx = undefined;
    this.start = function () {
        this.ctx = document.getElementById('gameCanvas').getContext('2d');
        this.car.show(this.ctx);
    };

    this.render = function () {
        this.ctx.clearRect(0, 0, GAMEBOARD_WIDTH, GAMEBOARD_HEIGHT);
        this.car.show(this.ctx);
    };

    this.moveCar = function (event) {
        var orientation = 0;
        switch (event.which) {
            case 37:
                orientation = ORIENTATION_LEFT;
                break;
            case 38:
                orientation = ORIENTATION_UP;
                break;
            case 39:
                orientation = ORIENTATION_RIGHT;
                break;
            case 40:
                orientation = ORIENTATION_DOWN;
                break;
        }

        if (orientation) {
            if (this.car.orientation !== orientation) {
                this.car.orientation = orientation;
            } else {
                this.car.move();
            }
            this.render();
        }
    }
}

var gameBoard = new GameBoard();
gameBoard.start();




