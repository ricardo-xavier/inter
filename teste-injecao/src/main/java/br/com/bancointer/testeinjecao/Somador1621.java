package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1621")
public class Somador1621 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
