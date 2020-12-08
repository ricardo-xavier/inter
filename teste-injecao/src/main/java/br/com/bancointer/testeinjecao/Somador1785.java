package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1785")
public class Somador1785 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
