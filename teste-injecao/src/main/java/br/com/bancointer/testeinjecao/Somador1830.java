package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1830")
public class Somador1830 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
