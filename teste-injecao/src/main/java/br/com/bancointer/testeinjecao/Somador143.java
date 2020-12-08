package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador143")
public class Somador143 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
