package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1201")
public class Somador1201 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
