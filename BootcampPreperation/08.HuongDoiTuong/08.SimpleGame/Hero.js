function Hero(image, top, left, down, size) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.down = down;
    this.size = size;

    this.getHeroElement = function(){
        return '<img width="'+ this.size + '"' +
          ' height="'+ this.size + '"' +
          ' src="' + this.image +'"' +
          ' style="top: '+this.top+'px; left:'+this.left+'px; down: ' + this.down + 'px" />';
      }
    
      this.moveRight = function(){
        this.left += 10;
        console.log('ok: ' + this.left);
      }
      this.moveDown = function() {
        this.top +=10;
        console.log('ok: ' + this.top);
      }
    
    }
    
    var hero = new Hero('mickey.png', 20, 30, 200);
    
    function start(){
      if(hero.left < window.innerWidth - hero.size){
        hero.moveRight();
      }
      document.getElementById('game').innerHTML = hero.getHeroElement();
      setTimeout(start, 500)
    }
    
    var hero = new Hero('mickey.png', 20, 30, 200);
    
    function start(){
      if(hero.left < window.innerWidth - hero.size){
        hero.moveRight();
      }
      document.getElementById('game').innerHTML = hero.getHeroElement();
      setTimeout(start, 500)
    }
    start();