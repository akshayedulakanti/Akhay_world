document.getElementById('f').addEventListener('submit',function(ev){
  ev.preventDefault();
  var n=document.getElementById('n').value,e=document.getElementById('e').value,m=document.getElementById('m').value;
  var body='Name: '+n+'\nEmail: '+e+'\n\n'+m;
  location.href='mailto:akshayedululakanti7013@gmail.com?subject='+encodeURIComponent('Portfolio message from '+n)+'&body='+encodeURIComponent(body);
});

(function(){var b=document.getElementById('mb'),m=document.getElementById('menu');
function set(o){m.classList.toggle('open',o);b.classList.toggle('on',o);b.setAttribute('aria-expanded',o);b.setAttribute('aria-label',o?'Close menu':'Open menu')}
b.addEventListener('click',function(){set(!m.classList.contains('open'))});
m.addEventListener('click',function(e){if(e.target.tagName==='A')set(false)});
document.addEventListener('keydown',function(e){if(e.key==='Escape')set(false)});})();akshayedululakanti7013@gmail.com
  0
